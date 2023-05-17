public class Array {
        public static void main(String[] args){
            Array ary= new Array();
            ary.Integer();
            ary.String();
        }
        void Integer(){
            int[] a={2,3,4,6};
            //for(int i=0;i<a.length;i++){
            for (int j : a) System.out.println(j * 10);
        }
        void String(){
            String[] s={"Ram","Shyam","Ganesh","Mahesh"};
            // for(int i=0;i<s.length;i++){
            for (String value : s) System.out.println(value);
        }
    }
