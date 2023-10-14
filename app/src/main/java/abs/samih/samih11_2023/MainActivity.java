package abs.samih.samih11_2023;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // تعريف الصفات: مؤشرات للكائنات على واجهة المستعمل 1
    private TextView tv_Output;
    private Button btn_Go;
    private EditText et_Input;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);// الربط بين فئة الجافا وملف التسيق
            //تحديد مؤشر كل كائن على الكائن في واجهة المستعمل 2
            tv_Output = findViewById(R.id.tvOutput);
            et_Input = findViewById(R.id.etInput);
            btn_Go = findViewById(R.id.btnGo);
        }
    }
    /**
     * دالة لمعالجة حدث الضغط على كائن بمواجهة المستعمل
     * على سبيل المثال الضغط على زر
     * @param v تتلقى مشر للكائن الذي سبب الحدث
     */
    public void onClickGo(View v)
    {
                    // استخراج نص من خقل
        String st= et_Input.getText().toString();
        //تحديد نص لحق من نوع نص
        tv_Output.setText(st);
    }
}