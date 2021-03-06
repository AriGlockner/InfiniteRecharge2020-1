package frc.team2412.robot.subsystems.constants;

public class IndexerConstants {
	public enum UnbalancedSide {
		FRONT, BACK;
		public void flip() {
			UnbalancedSide s = this;
			switch (s) {
			case FRONT:
				s = UnbalancedSide.BACK;
				break;
			case BACK:
				s = UnbalancedSide.FRONT;
				break;
			}
		}
	}

	// PID FOR AFTER A SENSOR PICKS UP A BALL
	public static final double PID_P = 0.03;
	public static final double PID_I = 0;
	public static final double PID_D = 0;

	// RATIO
	// GEARBOX = 5:1, SPINDLE DIA = 1.2

	// FOR OUTER SENSORS
	public static final double NORMAL_STOP_DISTANCE = 3;

	// FOR INNER SENSORS
	public static final double SHORT_STOP_DISTANCE = 2;
	public static final double LONG_STOP_DISTANCE = 5;

	// FOR MIDDLE
	public static final double EXTRA_LONG_STOP_DISTANCE = 10;

	public static final double SPINDLE_DIAMETER = 1.2;
	public static final double INCH_STOP_DISTANCE = 2;

	public static final double MAX_SPEED = 0.3;

	public static final int LIFT_DOWN_MS_DURATION_AFTER_SHUFFLE = 250;
	public static final double LIFT_DOWN_SPEED_FOR_INDEX = 0.1;
	public static final double MAX_LIFT_SPEED = 0.75;
	public static final double TOP_TICKS = 20;
	public static final double BOTTOM_TICKS = 0;
	public static final double SHIFT_DISTANCE = 25;

}
