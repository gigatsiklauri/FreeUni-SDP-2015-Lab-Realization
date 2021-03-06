package ge.edu.freeuni.sdp.snake.view.swing;

import ge.edu.freeuni.sdp.snake.presenter.GameOverPresenter;
import ge.edu.freeuni.sdp.snake.presenter.LevelPresenter;
import ge.edu.freeuni.sdp.snake.presenter.MazePresenter;
import ge.edu.freeuni.sdp.snake.view.GameOverView;
import ge.edu.freeuni.sdp.snake.view.LevelView;
import ge.edu.freeuni.sdp.snake.view.MazeView;
import ge.edu.freeuni.sdp.snake.view.ViewFactory;

public class SwingViewFactory implements ViewFactory{
	
	@Override
	public LevelView getLevelView(LevelPresenter presenter) {
		return new SwingLevelView(presenter);
	}

	@Override
	public MazeView getMazeView(MazePresenter presenter) {
		return new SwingMazeView(presenter);
	}

	@Override
	public GameOverView getGameOverView(GameOverPresenter presenter) {
		// TODO Auto-generated method stub
		return null;
	}

}
