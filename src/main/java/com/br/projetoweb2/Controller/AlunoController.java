package com.br.projetoweb2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.projetoweb2.Model.Aluno;

@Controller
public class AlunoController {

    List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/home")
    public String inicial() {
        return "home";
    }

    @PostMapping("/home")
    public String lista(Aluno aluno) {
        if (aluno.getId() != 0) {
            Aluno alunofind = new Aluno();
            for (Aluno aluno2 : alunos) {
                if (aluno2.getId() == aluno.getId()) {
                    alunofind = aluno2;
                }
            }
            alunos.set(alunos.indexOf(alunofind), aluno);
        } else {
            int id = alunos.size() + 1;
            alunos.add(new Aluno(id, aluno.getNome(), aluno.getUsuario(), aluno.getCurso(), aluno.getInstituto(),
                    aluno.getCargahoraria()));
        }
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView("lista");
        mv.addObject("alunos", alunos);
        return mv;
    }

    @GetMapping("/excluir/{id}")
    public ModelAndView excluir(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("lista");
        Aluno alunofind = new Aluno();
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunofind = aluno;
            }
        }

        alunos.remove(alunofind);
        mv.addObject("alunos", alunos);
        return mv;
    }

    @GetMapping("editar/{id}")
    public ModelAndView editar(@PathVariable("id") int id) {
        ModelAndView mv = new ModelAndView("home");
        Aluno alunofind = new Aluno();
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunofind = aluno;
            }
        }

        mv.addObject("aluno", alunofind);
        return mv;
    }

}
