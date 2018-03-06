package br.com.hugo.victor.mynumber.ui;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.hugo.victor.mynumber.R;
import br.com.hugo.victor.mynumber.utils.Convertor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // FAZ O BIND DOS ELEMENTOS USANDO A BUTTER KNIFE
    @BindView(R.id.tilNumber)
    TextInputLayout tilNumber;
    @BindView(R.id.tvNumber)
    TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // INICIALIZANDO O BUTTER KNIFE
        ButterKnife.bind(this);

    }

    //    EVENTO DE CLICK DO BOTÃO TRADUZIR
    @OnClick(R.id.btConverter)
    public void convertToNumber() {
        // INSTANCIANDO VARIÁVEIS
        StringBuilder tel = new StringBuilder();
        String aux;

        String[] splited = tilNumber.getEditText().getText().toString().split("");

        // PARA CADA LETRA ELE CONVERTE PARA UM NÚMERO
        for (String aSplited : splited) {
            aux = Convertor.convertToNumber(aSplited);

            if (aux != null) {
                tel.append(aux);
            }
        }

        // ATRIBUI UM VALOR PARA O TEXTVIEW
        tvNumber.setText(tel);
    }

    // EVENTO DE CLICK NO BOTÃO RESETAR
    @OnClick(R.id.btResetar)
    public void resetar() {
        // LIMPA OS CAMPOS
        tilNumber.setError(null);
        tilNumber.getEditText().setText(null);
        tvNumber.setText("");
    }
}
