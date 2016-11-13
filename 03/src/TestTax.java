class TestTax{
    public static void main(String[] args){
        Tax
        t = new NJTax(); // creating an instance
        // assigning the values to class members
        t.grossIncome= 20000;
        t.dependents= 2;
        t.state= "N";
        double yourTax = t.calcTax(); //calculating tax
        // Printing the result
        System.out.println("Your tax is " + yourTax);
    }
}