
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcprojectdemo;

/**
 *
 * @author Vicente
 */
public class Staff {
    /**
     * Declaracion de las variables privadas de la clase
     */
    private String NameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;
    /**
     * Metodo para visualizar el mensaje Calculando salario.
     */  
    public void printMessage()
    { 
        System.out.println("Calculando el salario...");
    }
    /**
     * Metodo que calcula el salario cuando no hay bonus.
     * @return salario sin bonus.
     */
    public int calculatePay()
    {
        printMessage();
        int staffPay;
        staffPay = hourlyRate * hoursWorked;
        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    /**
     * Metodo que calcula el salario cuando hay bonus.
     * @param bonus
     * @param allowance
     * @return 
     */
    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        if (hoursWorked>0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }
    /**
     * Mértodo setter que verifica que horas trabajadas es mayor que cero.
     * @param hours 
     */
    public void setHoursWorked(int hours)
    {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /**
     * Método getter para asignar valores a horas trabajadas
     * @return 
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    /**
     * Constructores que crean objetods.
     * @param name 
     */
    public Staff(String name)
    {
        String nameOfStaff = name;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
    public Staff(String firstName, String lastName)
    {
        String nameOfStaff = firstName + lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }
    }
