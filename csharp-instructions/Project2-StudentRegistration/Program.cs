using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Project2_StudentRegistration
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Student Registration Form\n");

            Console.Write("Enter first name: ");
            string FirstName = Console.ReadLine();

            Console.Write("Enter last name: ");
            string LastName = Console.ReadLine();

            Console.Write("Enter year of birth: ");
            String BirthYear = Console.ReadLine();

            String TempPassword = FirstName + "*" + BirthYear;

            Console.WriteLine("\nWelcome " + FirstName + " " + LastName + "!");
            Console.WriteLine("Your registration is complete.");
            Console.WriteLine("Your temporary password is: " + TempPassword);
            Console.ReadLine();
        }
    }
}
