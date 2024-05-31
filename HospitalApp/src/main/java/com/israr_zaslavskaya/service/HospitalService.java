package com.israr_zaslavskaya.service;

import com.israr_zaslavskaya.model.Doctor;
import com.israr_zaslavskaya.model.Hospital;
import com.israr_zaslavskaya.model.Specialty;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HospitalService {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

//        Hospital h1 = new Hospital("Mount Sinai");
//        Hospital h2 = new Hospital("Presbyterian");
//
//        Doctor d1 = new Doctor();
//        Doctor d2 = new Doctor();
//        Doctor d3 = new Doctor();
//        d1.setDoctorName("Lee");
//        d2.setDoctorName("Jack");
//        d3.setDoctorName("Mary");
//        d1.setHospital(h1);
//        d2.setHospital(h2);
//        d3.setHospital(h1);
//
//        Specialty s1 = new Specialty();
//        Specialty s2 = new Specialty();
//        Specialty s3 = new Specialty();
//        s1.setSpecialtyName("Cardiology");
//        s2.setSpecialtyName("General Practitioner");
//        s3.setSpecialtyName("Surgical");
//
//        session.persist(h1);
//        session.persist(h2);
//        session.persist(d1);
//        session.persist(d2);
//        session.persist(d3);
//        session.persist(s1);
//        session.persist(s2);
//        session.persist(s3);
//        tx.commit();

        getAllHospitals();

    }

    public static void getAllHospitals() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        TypedQuery<Hospital> query = session.createNamedQuery("displayAllHospitals", Hospital.class);
        List<Hospital> hospitals = query.getResultList();
        System.out.println(hospitals);

        factory.close();
        session.close();
    }

    public static void getHospitalById(int id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        TypedQuery<Hospital> query = session.createNamedQuery("findHospitalById", Hospital.class);
        query.setParameter("id", id);
        Hospital hospital = query.getSingleResult();
        System.out.println(hospital);
        factory.close();
        session.close();

    }

    public static void getHospitalByName(String name) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        TypedQuery<Hospital> query = session.createNamedQuery("findHospitalByName", Hospital.class);
        query.setParameter("name", name);
        List<Hospital> hospitals = query.getResultList();
        System.out.println(hospitals);
        factory.close();
        session.close();
    }

}
