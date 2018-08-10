package su.petrowich.jad_d4_fragments2

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class FragmentShow : Fragment() {

    private lateinit var layoutFragmentShow: LinearLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        layoutFragmentShow = view.findViewById(R.id.layout_fragment_show)
    }

    public fun setBackgroundColor(color: Int) {
        layoutFragmentShow.setBackgroundColor(color)
    }
}