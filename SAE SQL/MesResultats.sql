CREATE FUNCTION MesResultats( out Matiere_id int, out Controle_id int, out Note decimal(4,2))
	returns setof record
as
$$
	SELECT m.Matiere_id , c.Controle , n.Note
		FROM Etudiant e, Matiere m, Controle c, Note n 
			WHERE m.Matiere_id =c.Matiere_id
				AND c.Controle_id =n.Controle_id
				AND n.Etudiant_id =e.Etudiant_id
				AND e.Nom= session_user;
$$ language SQL
	SECURITY DEFINER;
