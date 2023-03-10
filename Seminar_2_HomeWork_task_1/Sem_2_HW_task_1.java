package Seminar_2_HomeWork_task_1;

import java.util.HashMap;
import java.util.Map;

/*
    Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
    используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
    Если значение null, то параметр не должен попадать в запрос.
    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class Sem_2_HW_task_1 {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Russia");
        params.put("city", "Moscow");
        params.put("age", null);

        System.out.println(GetQ(params));
    }

    public static String GetQ (Map<String, String> params){
        StringBuilder string = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()){
            if(pair.getValue() != null){
                string.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
            }
        }
        string.delete(string.toString().length()-5,string.toString().length()); //удалить из вывода последнее "and"
        return string.toString();
    }
}
