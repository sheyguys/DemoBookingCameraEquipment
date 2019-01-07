package sut.sa.g16;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import sut.sa.g16.Repository.*;
import sut.sa.g16.Entity.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class StudioDataloader {
    public static void main(String[] args) {
        SpringApplication.run(StudioDataloader.class, args);
    }

    @Bean
    ApplicationRunner init(BookingRepository bookingRepository, BrandEquipmentRepository brandEquipmentRepository, EquipmentRepository equipmentRepository,
                           MemberRepository memberRepository, TypeEquimentRepository typeEquimentRepository){
        return args -> {
            Stream.of("Canon","Nikon","Sony","Other").forEach(brand ->{
                if(brand.equals("Canon")){
                    BrandEquipment brandEquipment = new BrandEquipment();
                    brandEquipment.setEquipmentBrand("Canon");
                    brandEquipmentRepository.save(brandEquipment);

                }
                if(brand.equals("Nikon")){
                    BrandEquipment brandEquipment = new BrandEquipment();
                    brandEquipment.setEquipmentBrand("Nikon");
                    brandEquipmentRepository.save(brandEquipment);

                }
                if(brand.equals("Sony")){
                    BrandEquipment brandEquipment = new BrandEquipment();
                    brandEquipment.setEquipmentBrand("Sony");
                    brandEquipmentRepository.save(brandEquipment);

                }
                if(brand.equals("Other")){
                    BrandEquipment brandEquipment = new BrandEquipment();
                    brandEquipment.setEquipmentBrand("Other");
                    brandEquipmentRepository.save(brandEquipment);

                }
            });
            Stream.of("Camera","Lens","Tripod && Accessories","StudioLight").forEach(type ->{
                if(type.equals("Camera")){
                    TypeEquipment typeEquipment = new TypeEquipment();
                    typeEquipment.setEquipmentType("Camera");
                    typeEquimentRepository.save(typeEquipment);
                }
                if(type.equals("Lens")){
                    TypeEquipment typeEquipment = new TypeEquipment();
                    typeEquipment.setEquipmentType("Lens");
                    typeEquimentRepository.save(typeEquipment);
                }
                if(type.equals("Tripod && Accessories")){
                    TypeEquipment typeEquipment = new TypeEquipment();
                    typeEquipment.setEquipmentType("Tripod && Accessories");
                    typeEquimentRepository.save(typeEquipment);
                }
                if(type.equals("StudioLight")){
                    TypeEquipment typeEquipment = new TypeEquipment();
                    typeEquipment.setEquipmentType("StudioLight");
                    typeEquimentRepository.save(typeEquipment);
                }
            });
            Stream.of("john0","john1","john2","john3").forEach(name ->{
                if(name.equals("john0")){
                    Member member = new Member();
                    member.setUsername("mem1");
                    member.setPassword("1234");
                    member.setName("john0");
                    member.setEmailMember("test0@test.com");
                    member.setPhoneMember("081-13549");
                    memberRepository.save(member);
                }
                if(name.equals("john1")){
                    Member member = new Member();
                    member.setUsername("mem2");
                    member.setPassword("1234");
                    member.setName("john1");
                    member.setEmailMember("test1@test.com");
                    member.setPhoneMember("071-13549");
                    memberRepository.save(member);
                }
                if(name.equals("john2")){
                    Member member = new Member();
                    member.setUsername("mem3");
                    member.setPassword("1234");
                    member.setName("john2");
                    member.setEmailMember("test2@test.com");
                    member.setPhoneMember("061-13549");
                    memberRepository.save(member);
                }
                if(name.equals("john3")){
                    Member member = new Member();
                    member.setUsername("mem4");
                    member.setPassword("1234");
                    member.setName("john3");
                    member.setEmailMember("test3@test.com");
                    member.setPhoneMember("091-13549");
                    memberRepository.save(member);
                }
            });
            Stream.of("Canon EOS 5D Mark IV Body", "Sony A7RIII Body", "Nikon D850 Body", "Fujifilm X-H1 Body",
                    "Olympus OM-D E-M1 Mark II Body", "Canon EF 11-24mm f4L USM", "Canon EF 70-200mm f2.8L IS III USM",
                    "Canon TS-E 17mm f4L Tilt-Shift","Nikon AF-S 14-24mm f2.8G ED Nano","Nikon AF-S 70-200mm f2.8E FL ED VR Nano",
                    "Sony FE 50mm f1.4 Planar T* ZA", "Sony FE 100-400mm f4.5-5.6 GM OSS","ไม้กันสั่น Zhiyun Crane 2 Gimbal Stabilizer",
                    "Sandisk SD Card Extreme PRO 128GB 95MB/s", "แบตเตอรี่ Canon LP-E6", "Reflector 5 in 1 ขนาด 105cm (ทรงกลม)",
                    "Canon 600EX II-RT", "GoPro HERO7 Black", "Sony HVL-F60RM" ,"Nikon SB-5000", "Rode VideoMic Pro Plus On-Camera Shotgun Microphone").forEach(equipmentName ->{
                if(equipmentName.equals("Canon EOS 5D Mark IV Body")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Canon EOS 5D Mark IV Body");
                    equipment.setEquipmentPrice(1500);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Nikon D850 Body")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Nikon D850 Body");
                    equipment.setEquipmentPrice(1600);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(2L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Sony A7RIII Body")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Sony A7RIII Body");
                    equipment.setEquipmentPrice(1700);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(3L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Fujifilm X-H1 Body")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Fujifilm X-H1 Body");
                    equipment.setEquipmentPrice(1000);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Olympus OM-D E-M1 Mark II Body")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Olympus OM-D E-M1 Mark II Body");
                    equipment.setEquipmentPrice(700);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Canon EF 11-24mm f4L USM")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Canon EF 11-24mm f4L USM");
                    equipment.setEquipmentPrice(1000);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Canon EF 70-200mm f2.8L IS III USM")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Canon EF 70-200mm f2.8L IS III USM");
                    equipment.setEquipmentPrice(800);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Canon TS-E 17mm f4L Tilt-Shift")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Canon TS-E 17mm f4L Tilt-Shift");
                    equipment.setEquipmentPrice(1000);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Nikon AF-S 14-24mm f2.8G ED Nano")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Nikon AF-S 14-24mm f2.8G ED Nano");
                    equipment.setEquipmentPrice(600);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(2L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Nikon AF-S 70-200mm f2.8E FL ED VR Nano")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Nikon AF-S 70-200mm f2.8E FL ED VR Nano");
                    equipment.setEquipmentPrice(800);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(2L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Sony FE 50mm f1.4 Planar T* ZA")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Sony FE 50mm f1.4 Planar T* ZA");
                    equipment.setEquipmentPrice(700);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(3L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Sony FE 100-400mm f4.5-5.6 GM OSS")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Sony FE 100-400mm f4.5-5.6 GM OSS");
                    equipment.setEquipmentPrice(900);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(2L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(3L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("ไม้กันสั่น Zhiyun Crane 2 Gimbal Stabilizer")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("ไม้กันสั่น Zhiyun Crane 2 Gimbal Stabilizer");
                    equipment.setEquipmentPrice(1000);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(3L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Sandisk SD Card Extreme PRO 128GB 95MB/s")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Sandisk SD Card Extreme PRO 128GB 95MB/s");
                    equipment.setEquipmentPrice(150);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(3L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("แบตเตอรี่ Canon LP-E6")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("แบตเตอรี่ Canon LP-E6");
                    equipment.setEquipmentPrice(50);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(3L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Reflector 5 in 1 ขนาด 105cm (ทรงกลม)")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Reflector 5 in 1 ขนาด 105cm (ทรงกลม)");
                    equipment.setEquipmentPrice(50);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(3L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Rode VideoMic Pro Plus On-Camera Shotgun Microphone")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Rode VideoMic Pro Plus On-Camera Shotgun Microphone");
                    equipment.setEquipmentPrice(400);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(3L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Canon 600EX II-RT")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Canon 600EX II-RT");
                    equipment.setEquipmentPrice(50);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(4L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(1L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("GoPro HERO7 Black")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("GoPro HERO7 Black");
                    equipment.setEquipmentPrice(400);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(1L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(4L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Sony HVL-F60RM")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Sony HVL-F60RM");
                    equipment.setEquipmentPrice(350);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(4L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(3L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }

                if(equipmentName.equals("Nikon SB-5000")){
                    Equipment equipment = new Equipment();
                    equipment.setEquipmentName("Nikon SB-5000");
                    equipment.setEquipmentPrice(250);
                    TypeEquipment typeEquipment = typeEquimentRepository.findBytypeEquId(4L);
                    equipment.setTypeEquipment(typeEquipment);
                    BrandEquipment brandEquipment = brandEquipmentRepository.findBybrandEquId(2L);
                    equipment.setBrandEquipment(brandEquipment);
                    equipmentRepository.save(equipment);
                }
            });
        };
    }
}

