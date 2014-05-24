package za.co.maiatoday.helloble;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by maia on 2014/05/24.
 */
public class ConnectionFragment  extends Fragment {
    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ConnectionFragment getInstance() {
        ConnectionFragment fragment = new ConnectionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public ConnectionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_connection, container, false);
        TextView t = (TextView) rootView.findViewById(R.id.section_label);
        return rootView;
    }
}
