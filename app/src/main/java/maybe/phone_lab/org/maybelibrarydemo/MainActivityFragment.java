package maybe.phone_lab.org.maybelibrarydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import maybe.phone_lab.org.maybe.library.QueryIntentService;
import maybe.phone_lab.org.maybe.library.MaybeService;
import maybe.phone_lab.org.maybe.library.utils.Utils;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private MaybeService maybeService;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        maybeService = MaybeService.getInstance(getActivity().getApplicationContext());
//        this.testIntentService();
        this.testMaybeVariable();
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void testMaybeVariable() {
        int choice = maybeService.get("label");
        Utils.debug("choice: " + choice);
        switch (choice) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    private void testIntentService() {
        Intent intent = new Intent(getActivity(), QueryIntentService.class);
        intent.setAction("maybe.phone_lab.org.maybelibrary.action.FOO");
        intent.putExtra("maybe.phone_lab.org.maybelibrary.extra.PARAM1", "1");
        intent.putExtra("maybe.phone_lab.org.maybelibrary.extra.PARAM2", "2");
        getActivity().startService(intent);
    }
}
