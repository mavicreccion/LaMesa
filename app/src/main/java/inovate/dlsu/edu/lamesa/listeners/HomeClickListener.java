package inovate.dlsu.edu.lamesa.listeners;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Mavic Reccion on 2/10/2018.
 */

public class HomeClickListener implements IClickListener {
    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(view.getContext(), "Position " + pos, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongClick(View view, int pos) {

    }
}
