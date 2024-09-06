class Tester {
    
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double average = 0;
        double greater = 0;
        double smaller = 0;
        for (double a : salary) {
            average += a;
        }
        average /= salary.length;
        for (double a : salary) {
            if (a > average)
                greater++;
            else if (a < average)
                smaller++;
        }


        double[] result = {average, greater, smaller};
        return result;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
