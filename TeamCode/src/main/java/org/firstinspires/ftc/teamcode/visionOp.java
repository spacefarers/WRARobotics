package org.firstinspires.ftc.teamcode;

import android.app.Activity;
import android.widget.TextView;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.internal.system.AppUtil;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;

@TeleOp(name="Vision Test")
public class visionOp extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException{
        int cameraMonitorViewId=hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId","id",hardwareMap.appContext.getPackageName());
//        telemetry.addData("maps",hardwareMap.allDeviceMappings);
//        OpenCvCamera phoneCam=OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class,"Webcam"),cameraMonitorViewId);

        waitForStart();
        while (opModeIsActive()){
            FtcDashboard dashboard = FtcDashboard.getInstance();
            TelemetryPacket packet = new TelemetryPacket();
            packet.put("status",cameraMonitorViewId);
            dashboard.sendTelemetryPacket(packet);
        }
    }
}
