package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

import static frc.robot.Constants.ControllerConstants.*;

public class DriverCommand extends CommandBase{

    private final DriveSubsystem ds;
    private final ShooterSubsystem ss;

    public DriverCommand(DriveSubsystem DS, ShooterSubsystem SS) {
        ds = DS;
        ss = SS;
    }

    // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      double steerIn = kDriverController.getRawAxis(kRightHorizontal);
      double driveIn = kDriverController.getRawAxis(kLeftVertical);

      double l = driveIn - steerIn;
      double r = driveIn + steerIn;

      ds.setLeftPower(l);
      ds.setRightPower(r);

      ss.setDrum(kDriverController.getRawButton(kA));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
