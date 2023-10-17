class InsertDemo {
    public static void main(String args[])  {
         char ch[] = {'J','A','V','A'};

         StringBuffer sb1 = new StringBuffer("ring");
         System.out.println("String is  : "+sb1);
         StringBuffer sb2 = sb1.insert(0,'B');
         System.out.println("String after inserting 'B'  : "+sb2);
         System.out.println(sb1);
         System.out.println(sb1.length());
         StringBuffer sb3 = sb1.insert(sb1.length(),ch);
         System.out.println("String after inserting chars (java) : "+sb3);
      }
  }
