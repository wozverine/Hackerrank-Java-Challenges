        int a=0;
        double f=0.0;
        String b="None";
        /* Declare second integer, double, and String variables. */
        a=scan.nextInt();
        f=scan.nextDouble();
        while(scan.hasNext()){
            b = scan.nextLine();
        }
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i+a);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d+f);
        /* Print the sum of the double variables on a new line. */
		    System.out.printf("%s%s",s,b);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
