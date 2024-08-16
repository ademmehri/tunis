package com.rhplateforme.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.rhplateforme.token.TokenManager;

import java.io.File;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    @Async
    public String sendVerificationEmail(String to) {
        String verificationToken = TokenManager.generateToken(to);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Email Verification");
        message.setText("Your verification code is: " + verificationToken);
        mailSender.send(message);

        return verificationToken;
    }
    @Async
    public String sendemailoffre(String to,String nomentr,String descr) {
    
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Nouvelle offre d'emploi de la part de " + nomentr);
        message.setText(
            "Cher(e) candidat(e),\n\n" +
            "Nous avons le plaisir de vous informer que vous avez reçu une nouvelle offre d'emploi de la part de l'employeur \"" + nomentr + "\".\n\n" +
            "Voici une brève description de l'offre :\n" +
            descr + "\n\n" +
            "Nous vous invitons à consulter les détails de cette offre et à répondre dans les plus brefs délais.\n\n" +
            "Cordialement,\n" +
            "L'équipe de tie-job"
        );

       mailSender.send(message);

        return "ok";
    }
    @Async
    public String sendemailinscrit(String to,String descr) {
    
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("tie job");
        message.setText(descr);

       mailSender.send(message);

        return "ok";
    }
    @Async
    public String sendemailinscritemployeur(String to) {
    
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("tie job");
        message.setText("Nous vous souhaitons la bienvenue sur TIE JOB ! Votre compte employeur a été créé avec succès. \n"
        		+ "Nous sommes là pour vous aider à trouver les meilleurs talents pour votre établissement. N'hésitez pas à nous contacter si vous avez des questions ou besoin d'assistance pour utiliser notre site.\n"
        		+ "Merci de votre confiance en TIE JOB. Nous sommes impatients de vous aider à recruter les meilleurs talents du secteur de l'hôtellerie et de la restauration.\n"
        		+ "\n"
        		+ "Cordialement,\n"
        		+ "L'équipe de tiejob,\n"
        		+ "CEO El Mehri Mortadha");

       mailSender.send(message);

        return "ok";
    }
    @Async
    public String sendemailcontact(String to,String descr,String nom) {
    
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("mehri.mortadha@gmail.com");
        message.setSubject("Nouvelle Réclamation");
        message.setText("Nom: " + nom + "\nEmail: " + to + "\nMessage: " + descr);

       mailSender.send(message);

        return "ok";
    }

    }
