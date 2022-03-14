package lista08;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame
{
	public TelaPrincipal()
	{
		this.setTitle("Tela de acesso ao Sistema da Biblioteca");
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(true);
		
		Container c = this.getContentPane();
		
		JPanel painel = new JPanel();
		c.add(painel);
		
		JLabel rotulo1 = new JLabel("O que deseja cadastrar?");
		painel.add(rotulo1);
		
		JButton botao1 = new JButton("Professor");
		 JButton botao2 = new JButton("Aluno");
		 JButton botao3 = new JButton("Empréstimo");
		 JButton botao4 = new JButton("Livro");
		 painel.add(botao1);
		 painel.add(botao2);
		 painel.add(botao3);
		 painel.add(botao4);
		 
		 botao1.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaProfessor objProfessor = new TelaProfessor();
		 }});
		 
		 botao2.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaAluno objAluno = new TelaAluno();
		 }});
		 
		 botao3.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaEmprestimo objEmprestimo = new TelaEmprestimo();
		 }});
		 
		 botao4.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaLivro objLivro = new TelaLivro();
		 }});

	}

}
