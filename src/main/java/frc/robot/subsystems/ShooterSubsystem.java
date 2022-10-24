package frc.robot.subsystems;
import static frc.robot.Constants.ShooterConstants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{

    private final CANSparkMax drumMotorA = new CANSparkMax(kDrumOneID, MotorType.kBrushless);

    public ShooterSubsystem(){

    }

    public void setDrum(boolean b) {
        if (b) {
            drumMotorA.set(0.3);
        }
        else {
            drumMotorA.set(0);
        }
    }


}
