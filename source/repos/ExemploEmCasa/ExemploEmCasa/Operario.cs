using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
    public class Operario : Empregado
    {
        public double Comissao { get; set; }
        public double ValorDeProducao { get; set; }

        public void ImprimirDadosOperario()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade: {Idade} anos");
            Console.WriteLine($"Matricula: {Matricula}");
            Console.WriteLine($"Salario {Salario.ToString("C2")}");
            Console.WriteLine($"Setor: {Setor}");
            Console.WriteLine($"Comissão {Comissao.ToString("C2")}");
            Console.WriteLine($"Valor produção {ValorDeProducao.ToString("C2")}");
            Console.WriteLine("==============================================");
        }

        public void CalcularOperario()
        {
            double salario;

            salario = CalcularSalario()+(Comissao * ValorDeProducao);

            Console.WriteLine($"Salario Operario {salario.ToString("C2")}");
            Console.WriteLine("==============================================");
        }
    }
}
