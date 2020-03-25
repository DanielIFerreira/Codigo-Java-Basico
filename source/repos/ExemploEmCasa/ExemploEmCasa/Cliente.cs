using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
   public class Cliente : Pessoa
    {
        public string Email { get; set; }
        public string Telefone { get; set; }

        public void ImprimirDadosCliente()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade {Idade} anos");
            Console.WriteLine($"Email: {Email}");
            Console.WriteLine($"Telefone: {Telefone}");
            Console.WriteLine("==============================================");
        }
        
    }
}
