package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    public final CANSparkMax frontLeftMotor = new CANSparkMax(2, MotorType.kBrushless);

    @Override
    public void periodic() {

    }
    
}
