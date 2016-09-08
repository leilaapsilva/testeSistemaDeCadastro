package leilaapsilva.sistemadecadastro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Registro> aRegistro;
    TelaPrincipal tela_principal;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aRegistro = new ArrayList<Registro>(); //iniciando e criando em memória o ArrayList que
        // armazenará todos os registros que serão gerenciados pelo programa

        tela_principal = new TelaPrincipal(this);
        tela_cadastro = new TelaCadastroUsuario(this, tela_principal);
        tela_listagem = new TelaListagemUsuarios(this, tela_principal);
        tela_principal.setTelaCadastro(tela_cadastro);
        tela_principal.setTelaListagem(tela_listagem);

        tela_principal.CarregarTela();

    }


    public ArrayList<Registro> getRegistros(){
        return aRegistro;
    }

    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("OK", null);
        d.show();

    }
}



