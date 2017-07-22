package sample.contract;

/**
 * Created by daniel on 22/07/17.
 */
public class Login {

    public interface View extends Base.View {
        Login.Presenter presenter = null;
    }

    public interface Presenter extends Base.Presenter {
        Login.View view = null;
    }
}
