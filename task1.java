
// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task1 {

    public static void main(String[] args) {
        String[] db = { "name:Ivanov", "country:Russia", "city:Moscow", "age:null" };
        String inquiry = "select * from students where ";
        StringBuilder sb = new StringBuilder(inquiry);
        for (int i = 0; i <= db.length - 1; i++) {
            db[i].replace('"', ' '); // избавились от кавычек
            String[] elements = db[i].split(":"); // разбили каждый элемент db на новый массив из 2 строк
            if (elements[1] != "null" & i < db.length - 2) {
                sb.append(elements[0]).append(" = ").append(elements[1]).append(" and "); // добавили and 
            }
            if (elements[1] != "null" & i == db.length - 2) {
                sb.append(elements[0]).append(" = ").append(elements[1]); // закончили перечисление
            }
            
        }
        System.out.println(sb);
    }

}
