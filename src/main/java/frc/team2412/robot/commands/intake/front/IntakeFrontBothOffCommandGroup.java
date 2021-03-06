package frc.team2412.robot.commands.intake.front;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.team2412.robot.subsystems.IntakeMotorSubsystem;
import frc.team2412.robot.subsystems.IntakeLiftSubsystem;

public class IntakeFrontBothOffCommandGroup extends ParallelCommandGroup {
	public IntakeFrontBothOffCommandGroup(IntakeLiftSubsystem intakeUpDownSubsystem,
			IntakeMotorSubsystem intakeOnOffSubsystem) {

		addCommands(new IntakeFrontDownCommand(intakeUpDownSubsystem), new IntakeFrontOffCommand(intakeOnOffSubsystem));
	}

}
