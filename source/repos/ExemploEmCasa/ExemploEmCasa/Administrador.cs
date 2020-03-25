using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
   public class Administrador : Empregado
    {
        public double AjudaDeCusto { get; set; }

        public void ImprimirDadosAdministrador()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade: {Idade}");
            Console.WriteLine($"Matricula: {Matricula}");
            Console.WriteLine($"Salario {Salario.ToString("C2")}");
            Console.WriteLine($"Setor {Setor}");
            Console.WriteLine($"Ajuda de custo {AjudaDeCusto.ToString("C2")}");
            Console.WriteLine("==============================================");
        }
        public void CalculoAdministrador()
        {
            double resultado;
            resultado = AjudaDeCusto;

            Console.WriteLine($"Salario + Ajuda de custo = {resultado.ToString("C2")}");
            Console.WriteLine("==============================================");
        }
    }
}
