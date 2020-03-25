using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
   public class Fornecedor : Pessoa
    {
        public double Receita { get; set; }
        public double Despesa { get; set; }


        public void ImprimirDadosFornecedor()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Fornecedor: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade: {Idade} anos");
            Console.WriteLine($"Receita {Receita.ToString("C2")}");
            Console.WriteLine($"Despesa {Despesa.ToString("C2")}");
            Console.WriteLine("==============================================");

        }
        
        public void FornecedorSaldo()
        {
            double resultado;

            resultado = Receita - Despesa;

            Console.WriteLine($"Lucro de {resultado.ToString("C2")}");
            Console.WriteLine("==============================================");
        }
    }
}
