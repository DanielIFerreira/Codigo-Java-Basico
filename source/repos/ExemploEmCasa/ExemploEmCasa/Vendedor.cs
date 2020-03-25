using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
    public class Vendedor : Empregado
    {
        public double Comissao { get; set; }
        public double ValorDeVendas { get; set; }


        public void ImprimirDadosVendedor()
        {
            Console.WriteLine("==============================================");
            Console.WriteLine($"Nome: {Nome}");
            Console.WriteLine($"Contribuinte: {Contribuinte}");
            Console.WriteLine($"Idade: {Idade} anos");
            Console.WriteLine($"Matricula: {Matricula}");
            Console.WriteLine($"Salario {Salario.ToString("C2")}");
            Console.WriteLine($"Setor: {Setor}");
            Console.WriteLine($"Comissão {Comissao.ToString("C2")}");
            Console.WriteLine($"Valor de vendas {ValorDeVendas.ToString("C2")}");
            Console.WriteLine("==============================================");

        }

        public void CalcularVendedor()
        {
            double result;
            result = CalcularSalario() + (Comissao * ValorDeVendas);

            Console.WriteLine($"Salario final {result.ToString("C2")}");
            Console.WriteLine("==============================================");
        }
    }
}
