using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
   public class Empregado : Pessoa
    {
        public int Matricula { get; set; }
        public double Salario { get; set; }
        public string Setor { get; set; }

        public void ImprimirDadosEmpregado()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade: {Idade} anos");
            Console.WriteLine($"Matricula: {Matricula}");
            Console.WriteLine($"Salario: {Salario.ToString("C2")}");
            Console.WriteLine($"Setor: {Setor}");
            Console.WriteLine("==============================================");
        }
        public double CalcularSalario()
        {
         
            double salario;

            salario = Salario - (Salario * 0.11);
            return salario;

            

        }
    }
}
