/*
 * Copyright 2020 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ebivariation.contigalias.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;


@Entity
@Table
public class ChromosomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    private String name;

    private String genbank;

    private String refseq;

    @ManyToOne(cascade = CascadeType.ALL)
    private AssemblyEntity assembly;

    public ChromosomeEntity() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenbank() {
        return genbank;
    }

    public String getRefseq() {
        return refseq;
    }

    public AssemblyEntity getAssembly() {
        return assembly;
    }

    public ChromosomeEntity setId(long id) {
        this.id = id;
        return this;
    }

    public ChromosomeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ChromosomeEntity setGenbank(String genbank) {
        this.genbank = genbank;
        return this;
    }

    public ChromosomeEntity setRefseq(String refseq) {
        this.refseq = refseq;
        return this;
    }

    public ChromosomeEntity setAssembly(AssemblyEntity assembly) {
        this.assembly = assembly;
        return this;
    }

}
