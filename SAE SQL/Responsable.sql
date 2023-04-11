CREATE VIEW Responsable
AS
    SELECT r.ResponsableDeMatiere_id,m.matiere_id,e.enseignant_id,e.nom,e.prenom
    FROM Enseignant e, matiere m, ResponsableDeMatiere r
        WHERE m.matiere_id=r.matiere_id
            AND r.enseignant_id = e.enseignant_id;
     

