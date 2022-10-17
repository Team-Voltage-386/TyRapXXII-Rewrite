package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    public final CANSparkMax frontLeftMotor = new CANSparkMax(Constants.DriveConstants.kFrontLeft, MotorType.kBrushless);

    @Override
    public void periodic() {

    }
    
}
