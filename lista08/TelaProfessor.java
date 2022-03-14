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

public class TelaProfessor extends JFrame
{
	public TelaProfessor()
	{
		 this.setTitle("Tela de Acesso ao Sistema");
		 this.setSize(500,300);
		 this.setVisible(true);
		 this.setResizable(true);
		 
		 Container c = this.getContentPane();
		 
		 JPanel painel = new JPanel();
		 c.add(painel);
		 
		 JLabel rotulo1 = new JLabel("Nome: ");
		 painel.add(rotulo1);
		 JTextField caixa1 = new JTextField(30);
		 painel.add(caixa1);
		 JLabel rotulo2 = new JLabel("Matrícula: ");
		 painel.add(rotulo2);
		 JTextField caixa2 = new JTextField(30);
		 painel.add(caixa2);
		 JLabel rotulo3 = new JLabel("Titulação: ");
		 painel.add(rotulo3);
		 JTextField caixa3 = new JTextField(30);
		 painel.add(caixa3);
		 JLabel rotulo4 = new JLabel("Data de admissão: ");
		 painel.add(rotulo4);
		 JTextField caixa4 = new JTextField(30);
		 painel.add(caixa4);
		 
		 JButton botao1 = new JButton("ENTRAR");
		 JButton botao2 = new JButton("LIMPAR");
		 JButton botao3 = new JButton("FECHAR");
		 painel.add(botao1);
		 painel.add(botao2);
		 painel.add(botao3);
		 
		 botao1.addActionListener(new ActionListener()
		 { 
			 public void actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(null,"NOME: " +
		 caixa1.getText() + "\nMATRÍCULA: " +caixa2.getText() + "\nTITULAÇÃO: " +caixa3.getText() + "\nDATA DE ADMISSÃO: " +
		 caixa4.getText());}
		 });
		 botao2.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
		     { 
				 caixa1.setText("");
		         caixa2.setText("");
		         caixa3.setText("");
		         caixa4.setText("");
		 }});
		 
		 botao3.addActionListener(new ActionListener()
		 { 
			 public void actionPerformed(ActionEvent e)
		     { System.exit(0); }
		 });
		 
	}
}


