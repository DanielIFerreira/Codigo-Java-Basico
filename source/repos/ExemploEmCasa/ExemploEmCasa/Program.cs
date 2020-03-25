using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploEmCasa
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Fornecedor objforncedor = new Fornecedor();
            objforncedor.Nome = "Vanessa Dias";
            objforncedor.Contribuinte = 01;
            objforncedor.Idade = 25;
            objforncedor.Receita = 4080.12;
            objforncedor.Despesa = 1560.10;

            objforncedor.ImprimirDadosFornecedor();
            objforncedor.FornecedorSaldo();
            

            Empregado objempregado = new Empregado();
            objempregado.Nome = "Daniel Ferreira";
            objempregado.Contribuinte = 02;
            objempregado.Idade = 30;
            objempregado.Matricula = 0202;
            objempregado.Salario = 1890.90;
            objempregado.Setor = "Montagem Edscha";

            
            objempregado.ImprimirDadosEmpregado();
            objempregado.CalcularSalario();

            Cliente objcliente = new Cliente();
            objcliente.Nome = "José Antunes";
            objcliente.Contribuinte = 03;
            objcliente.Idade = 38;
            objcliente.Email = "joseant@gmail.com";
            objcliente.Telefone = "(15)99705-4355";

            objcliente.ImprimirDadosCliente();
            

            Administrador objadministrador = new Administrador();
            objadministrador.Nome = "Carlos Eduardo";
            objadministrador.Contribuinte = 04;
            objadministrador.Idade = 21;
            objadministrador.Matricula = 0203;
            objadministrador.Salario = 5000.98;
            objadministrador.Setor = "Administração";
            objadministrador.AjudaDeCusto = 560.87;

            objadministrador.ImprimirDadosAdministrador();
            objadministrador.CalculoAdministrador();

            Operario objoperario = new Operario();
            objoperario.Nome = "Andre Felipe";
            objoperario.Contribuinte = 05;
            objoperario.Idade = 23;
            objoperario.Matricula = 0204;
            objoperario.Salario = 1530.90;
            objoperario.Setor = "Produção";
            objoperario.Comissao = 200.01;
            objoperario.ValorDeProducao = 12;

            objoperario.ImprimirDadosOperario();
            objoperario.CalcularOperario();


            Vendedor objvendedor = new Vendedor();
            objvendedor.Nome = "Paola Bratio";
            objvendedor.Contribuinte = 06;
            objvendedor.Idade = 39;
            objvendedor.Matricula = 0205;
            objvendedor.Salario = 980.45;
            objvendedor.Setor = "Vendas";
            objvendedor.Comissao = 30.98;
            objvendedor.ValorDeVendas = 45.90;

            objvendedor.ImprimirDadosVendedor();
            objvendedor.CalcularVendedor();

            Console.ReadLine();
        }
    }
}
