package HW_10823;

public class SQLFound {
    public static void main(String[] args) {
        String[]  sqlParseCars = new String[]{"Model", "V-60", "Contry", "Germany", "city", "Berlin", "year", null, "activ", "true"};
            StringBuilder strB = new StringBuilder("");
            for(int i=1; i < sqlParseCars.length; i+=2){
                System.out.print(sqlParseCars[i]+" ");
                if (sqlParseCars[i] != null ) {
                    strB.append(" "+sqlParseCars[i-1]+" = " + "'"+sqlParseCars[i]+"' AND");
                }
            }
        System.out.println(strB);
            strB.delete(strB.length()-4, strB.length());
        System.out.println("\nSELECT * FROM cars WHERE"+strB);
    }
}
