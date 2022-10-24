package frc.robot.subsystems;

import static frc.robot.Constants.DriveConstants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
    // initialize motors and drivetrain
    
    public final CANSparkMax frontLeftMotor = new CANSparkMax(kFrontLeft, MotorType.kBrushless);
    public final CANSparkMax frontRightMotor = new CANSparkMax(kFrontRight, MotorType.kBrushless);
    public final CANSparkMax rearLeftMotor = new CANSparkMax(kRearLeft, MotorType.kBrushless);
    public final CANSparkMax rearRightMotor = new CANSparkMax(kRearRight, MotorType.kBrushless);

    public DriveSubsystem() {
        frontLeftMotor.setInverted(true);
        frontRightMotor.setInverted(false);
        rearLeftMotor.follow(frontLeftMotor);// front left yields faulty encoder values so that set follower
        rearRightMotor.follow(frontRightMotor);
    }

    @Override
    public void periodic() {
    }

    public void setLeftPower(double s) {
        frontLeftMotor.set(s);
    }

    public void setRightPower(double s) {
        frontRightMotor.set(s);
    }
    
}
