package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

import static frc.robot.Constants.ControllerConstants.*;

public class DriverCommand extends CommandBase{

    private final DriveSubsystem ds;

    public DriverCommand(DriveSubsystem DS) {
        ds = DS;
    }

    // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  // Steering is surpressed by 20%, and drive power input by 25%
  @Override
  public void execute() {
      double steerIn = kDriverController.getRawAxis(kRightHorizontal) * 0.80; 
      double driveIn = kDriverController.getRawAxis(kLeftVertical) * 0.75; 


      steerIn = Math.pow(steerIn, 3);

      double l = driveIn - steerIn;
      double r = driveIn + steerIn;

      ds.setLeftPower(l);
      ds.setRightPower(r);
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
