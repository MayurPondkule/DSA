public class StringBuilderuse {

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("mayur");

        // character At index
        System.out.println(str.charAt(2));

        //set char at index (replace)
        str.setCharAt(0, 'a');
        System.out.println(str);


        // insert at index string or char
        str.insert(0, "abc");
        System.out.println(str);


        // //delete from to index
        str.delete(0, 3);
        System.out.println(str);
        str.delete(0, 1);
        // System.out.println(str);

        // str.insert(4, "kssdsf");
        // System.out.println(str);

        // //appends in string
        str.append("p");
        System.out.println(str);






    }
    
}
