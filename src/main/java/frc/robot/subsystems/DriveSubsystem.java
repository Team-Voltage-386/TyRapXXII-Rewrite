package frc.robot.subsystems;

import static frc.robot.Constants.DriveConstants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    private final CANSparkMax frontLeftMotor = new CANSparkMax(kFrontLeft, MotorType.kBrushless);
    private final CANSparkMax frontRightMotor =  new CANSparkMax(kFrontRight, MotorType.kBrushless);
    private final CANSparkMax rearLeftMotor = new CANSparkMax(kRearLeft, MotorType.kBrushless);
    private final CANSparkMax rearRightMotor = new CANSparkMax(kRearRight, MotorType.kBrushless);

    public DriveSubsystem() {
        frontLeftMotor.setInverted(true);
        frontRightMotor.setInverted(false);
        rearLeftMotor.follow(frontLeftMotor);// front left yields faulty encoder values so that set follower
        rearRightMotor.follow(frontRightMotor);
    }

    @Override
    public void periodic() {
        // custom code here
    }

    public void setLeftPower(double s) {
        frontLeftMotor.set(s);
    }

    public void setRightPower(double s) {
        frontRightMotor.set(s);
    }
    
}
