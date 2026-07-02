# 👥 AI-Powered HR Management System

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/OpenAI-GPT--4-412991?style=for-the-badge&logo=openai&logoColor=white" />
  <img src="https://img.shields.io/badge/React-18-20232A?style=for-the-badge&logo=react&logoColor=61DAFB" />
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
</p>

> A comprehensive **AI-powered HR platform** that streamlines recruitment, employee management, and performance analytics. Uses GPT-4 for intelligent resume screening, skill matching, and HR insights.

---

## ✨ Features

### 🎯 Smart Recruitment
- **AI Resume Parser** — Automatically extracts skills, experience, and education from PDFs
- **Candidate Ranking** — GPT-4 scores candidates against job requirements
- **Interview Questions** — AI generates role-specific technical interview questions
- **Job Description Generator** — AI writes optimized job postings

### 👨‍💼 Employee Management
- **Employee Lifecycle** — Onboarding → Active → Offboarding workflows
- **Org Chart** — Dynamic organizational hierarchy visualization
- **Leave Management** — Automated approval workflows
- **Document Management** — Contracts, certificates, and HR documents

### 📊 Performance Analytics
- **OKR Tracking** — Objectives and Key Results management
- **360° Reviews** — Peer, manager, and self-assessment cycles
- **AI Performance Insights** — GPT-4 summarizes review feedback
- **Retention Risk** — ML model predicts attrition risk per employee

### 💰 Payroll Integration
- **Payroll Processing** — Automated salary computation with tax deductions
- **Payslip Generation** — PDF payslips with configurable templates

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3.2 |
| AI Engine | OpenAI GPT-4 + LangChain4j |
| Resume Parsing | Apache PDFBox + AI extraction |
| Frontend | React 18 + TypeScript + Ant Design |
| Database | PostgreSQL 15 |
| File Storage | AWS S3 |
| Email | Spring Mail + SendGrid |
| Auth | Spring Security + OAuth2 |
| Containerization | Docker + Docker Compose |

---

## 🚀 Quick Start

```bash
git clone https://github.com/Pcveldi22/ai-hr-management.git
cd ai-hr-management
export OPENAI_API_KEY=your_key_here
docker-compose up -d
# App: http://localhost:3000
# API: http://localhost:8080
```

---

## 📁 Project Structure

```
ai-hr-management/
├── backend/
│   ├── src/main/java/com/chanduveldi/hr/
│   │   ├── recruitment/     # AI recruitment module
│   │   ├── employee/        # Employee management
│   │   ├── performance/     # Performance reviews
│   │   ├── payroll/         # Payroll processing
│   │   └── ai/              # OpenAI integrations
│   └── pom.xml
├── frontend/                # React 18 dashboard
└── docker-compose.yml
```

---

## 📄 License

MIT License — see [LICENSE](LICENSE) for details.

<p align="center">Made with ❤️ by <a href="https://github.com/Pcveldi22">Pc Veldi</a> | Senior Software Engineer</p>
