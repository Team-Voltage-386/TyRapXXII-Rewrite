// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.ColorSensorV3;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DataLogManager;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    /** the indexes to address buttons on the controller */
    public static final class ControllerConstants {
        public static final Joystick kDriverController = new Joystick(0);
        public static final Joystick kManipulatorController = new Joystick(1);
        public static final int kLeftVertical = 1;
        public static final int kRightVertical = 5;
        public static final int kLeftHorizontal = 0;
        public static final int kRightHorizontal = 4;
        public static final int kLeftTrigger = 2;
        public static final int kRightTrigger = 3;

        public static final int kA = 1;
        public static final int kB = 2;
        public static final int kX = 3;
        public static final int kY = 4;
        public static final int kLeftBumper = 5;
        public static final int kRightBumper = 6;
        public static final int kLeftOptions = 7;
        public static final int kRightOptions = 8;
        public static final int kLeftJoystickPressed = 9;
        public static final int kRightJoystickPressed = 10;
    }

    /** limelight settings */
    public static final class LimeLightConstants {
        public static final double targetHeight = 2.6416;
        public static final double mountHeight = 0.95; //98
        public static final double mountAngle = 41; //43;
    }
    /** shooting system constants */
    public static final class ShooterConstants {
        public static final int kDrumOneID = 11;
        public static final int kDrumTwoID = 12;
        public static final int kDrumIdleSpeed = 2200;
        public static final int kDrumSpeedTolerance = 40;
        public static final int kHoodDownLimitPin = 9;
        public static final int kBreachSensorPin = 0;
        public static final int kIntakeColorSensorThreshold = 140;
        public static final double kHoodPositionTolerance = 0.004;
        public static final double kDrumEjectPower = -0.3;
        public static final ColorSensorV3 intakeSensor = new ColorSensorV3(I2C.Port.kMXP);
        public static final int kIntakeID = 30;
        public static final int kHoodID = 31;
        public static final int kBeltID = 32;
        public static final int kHoodEncoderPin = 8;
        public static final double kIntakePower = -0.65;
        public static final double kIntakeReversePower = 0.2;
        public static final double kBeltReversePower = 0.5;
        public static final double kBeltPower = -0.9;
        public static final int kChannelIntakeForwardGo = 7;
        public static final int kChannelIntakeForwardVent = 5;
        public static final int kChannelIntakeBackwardGo = 6;
        public static final int kChannelIntakeBackwardVent = 4;
    }

    /** the climbing constants */
    public static final class ElevatorConstants {
        public static final int kChannelClimbIn = 1;
        public static final int kChannelClimbOut = 0;
        public static final int kElevatorLeaderID = 13;
        public static final int kElevatorFollowerID = 14;
        public static final int kPneumaticsDIOID = 5;
        public static final int kElevatorLowerLimitDIOID = 1;
        public static final int kElevatorUpperLimitDIOID = 2;
    }

    /** Can IDs, PID values, ect. */
    public static final class DriveConstants {
        public static final int kFrontLeft = 2; // CAN (Spark)
        public static final int kFrontRight = 3; // CAN (Spark)
        public static final int kRearLeft = 4; // CAN (Spark)
        public static final int kRearRight = 5; // CAN (Spark)
        public static final PneumaticsModuleType solenoidType = PneumaticsModuleType.CTREPCM;
        public static final int kShiftUp = 1;
        public static final int kShiftDown = 2;
        public static final double kSmoothingAccelFactor = 0.2;
        public static final double kSmoothingDecelFactor = 0.1;
        public static final double kMPR = 0.0207;// meters per revolution
        public static final double kMPRH = 0.07;
        public static final int kGyro = 10;
        public static final double highGearInputLimit = 0.8;
        public static final double highGearTurnLimit = 0.7;
        public static final double[] kDriveDistances = {0,1,2,3,4,30};
        public static final double[] kDrivePowers = {0.0,0.12,0.9,1,1,1};
        public static final double kAutoDriveSmoothing = 0.065;
    }
}
