package su.petrowich.jad_d4_fragments2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //кароче, нихрена у меня не получилось сделать по-науке
        //сделал всё старым добрым полиморфизмом

        val fragmentShow = FragmentShow()
        val fragmentControl = FragmentControl(fragmentShow) //сцылку на управляемый фрагмент тупо передаю в конструктор

        if (savedInstanceState == null) {
            var fragmentControlTransition = supportFragmentManager.beginTransaction()
            fragmentControlTransition.replace(R.id.fragment_control, fragmentControl)
            fragmentControlTransition.commit()


            fragmentControlTransition = supportFragmentManager.beginTransaction()
            fragmentControlTransition.replace(R.id.fragment_show, fragmentShow)
            fragmentControlTransition.commit()
        }
    }
}
