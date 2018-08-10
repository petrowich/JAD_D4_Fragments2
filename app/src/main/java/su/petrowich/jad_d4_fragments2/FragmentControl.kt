package su.petrowich.jad_d4_fragments2

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

@SuppressLint("ValidFragment")//что это значит пока не понял
class FragmentControl(fragmentShow: FragmentShow) : Fragment() {

    private var fragmentShow: FragmentShow = fragmentShow

    private lateinit var buttonBlue: Button
    private lateinit var buttonRed: Button
    private lateinit var buttonGreen: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_control, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonBlue = view.findViewById(R.id.button_blue)
        buttonRed = view.findViewById(R.id.button_red)
        buttonGreen = view.findViewById(R.id.button_green)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        buttonBlue.setOnClickListener {
            fragmentShow.setBackgroundColor(Color.BLUE)
        }

        buttonRed.setOnClickListener {
            fragmentShow.setBackgroundColor(Color.RED)
        }

        buttonGreen.setOnClickListener {
            fragmentShow.setBackgroundColor(Color.GREEN)
        }
    }
}