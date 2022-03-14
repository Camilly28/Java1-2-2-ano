package lista08;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEmprestimo extends JFrame
{
	public TelaEmprestimo()
	{
			this.setTitle("Tela de Acesso ao Sistema da Biblioteca");
			this.setSize(500,300);
			this.setVisible(true);
			this.setResizable(true);
			
			Container c = this.getContentPane();
			
			JPanel painel = new JPanel();
			c.add(painel);
			
			 JLabel rotulo1 = new JLabel("Data de empréstimo: ");
			 painel.add(rotulo1);
			 JTextField caixa1 = new JTextField(30);
			 painel.add(caixa1);
			 JLabel rotulo2 = new JLabel("Prazo de entrega: ");
			 painel.add(rotulo2);
			 JTextField caixa2 = new JTextField(30);
			 painel.add(caixa2);
			 JLabel rotulo3 = new JLabel("Data de devolução: ");
			 painel.add(rotulo3);
			 JTextField caixa3 = new JTextField(30);
			 painel.add(caixa3);
			 
			 JButton botao1 = new JButton("ENTRAR");
			 JButton botao2 = new JButton("LIMPAR");
			 JButton botao3 = new JButton("FECHAR");
			 painel.add(botao1);
			 painel.add(botao2);
			 painel.add(botao3);
			 
			 botao1.addActionListener(new ActionListener()
			 { 
				 public void actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(null,"DATA DE EMPRÉSTIMO: " +
			 caixa1.getText() + "\nPRAZO DE ENTREGA: " +caixa2.getText() + "\nDATA DE DEVOLUÇÃO: " +caixa3.getText());}
			 });
			 botao2.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
			     { 
					 caixa1.setText("");
			         caixa2.setText("");
			         caixa3.setText("");
			 }});
			 
			 botao3.addActionListener(new ActionListener()
			 { 
				 public void actionPerformed(ActionEvent e)
			     { System.exit(0); }
			 });

			
	}
}
