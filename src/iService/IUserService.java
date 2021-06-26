package iService;

import view.viewModel.UserViewModel;

public interface IUserService {
    boolean checkLogin(UserViewModel userViewModel);

    String registration(UserViewModel userViewModel);
}
