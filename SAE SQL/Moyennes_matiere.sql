CREATE VIEW Moyennes_matiere
AS
    SELECT e.etudiant_id,m.matiere_id,c.controle_id,note,
        avg(note) as moyenne
    FROM etudiant e, matiere m, controle c, note n
        WHERE m.matiere_id=c.matiere_id
            AND c.controle_id =n.controle_id
            AND n.etudiant_id = e.etudiant_id
        GROUP BY e.etudiant_id,m.matiere_id,c.controle_id,note;
