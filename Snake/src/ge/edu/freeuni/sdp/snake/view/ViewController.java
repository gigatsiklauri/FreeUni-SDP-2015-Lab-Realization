package ge.edu.freeuni.sdp.snake.view;

import ge.edu.freeuni.sdp.snake.presenter.*;

public class ViewController {

	private ViewFactory _viewFactory;
	private PresenterFactory _presenterRegistry;

	public ViewController(ViewFactory viewFactory) {
		this(viewFactory, new PresenterFactory());
	}
	
	public ViewController(ViewFactory viewFactory,
			PresenterFactory presenterRegistry) {
		_viewFactory = viewFactory;
		_presenterRegistry = presenterRegistry;
	}

	public void run() {

		// LevelView --> MazeView --> GameOverView

		LevelPresenter levelPresenter = _presenterRegistry.getLevelPresenter();
		LevelView levelView = _viewFactory.getLevelView(levelPresenter);
		levelView.show();

		MazePresenter mazePresenter = _presenterRegistry.getMazePresenter();
		MazeView mazeView = _viewFactory.getMazeView(mazePresenter);
		mazeView.show();

		/*
		 * The same for GameOverView
		 */
	}
}